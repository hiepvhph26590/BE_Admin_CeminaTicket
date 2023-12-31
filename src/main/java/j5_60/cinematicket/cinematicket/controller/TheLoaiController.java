package j5_60.cinematicket.cinematicket.controller;

import j5_60.cinematicket.cinematicket.entity.TheLoai;
import j5_60.cinematicket.cinematicket.exception.NotFoundException;
import j5_60.cinematicket.cinematicket.repository.TheLoaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("cimena/the-loai")
@CrossOrigin
public class TheLoaiController {

    @Autowired
    TheLoaiRepository theLoaiRepository;

    @GetMapping("/hien-thi")
    public List<TheLoai> get() {
        return theLoaiRepository.findAll();
    }

    @GetMapping("/{id}")
    public TheLoai getById(@PathVariable("id") UUID id) {
        return theLoaiRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id));
    }

    @PostMapping("/add")
    public TheLoai add(@RequestBody TheLoai theLoai) {
        LocalDateTime localDateTime = LocalDateTime.now();
        theLoai.setCreateAt(localDateTime);
        return theLoaiRepository.save(theLoai);
    }

    @PutMapping("/update/{id}")
    public TheLoai update(@PathVariable("id") UUID id,
                          @RequestBody TheLoai theLoai) {
        return theLoaiRepository.findById(id)
                .map(theLoaiUpdate -> {
                    theLoaiUpdate.setTen(theLoai.getTen());
                    theLoaiUpdate.setMoTa(theLoai.getMoTa());
                    LocalDateTime localDateTime = LocalDateTime.now();
                    theLoaiUpdate.setUpdateAt(localDateTime);
                    return theLoaiRepository.save(theLoaiUpdate);
                }).orElseThrow(() -> new NotFoundException(id));
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id) {
        if (!theLoaiRepository.existsById(id)) {
            throw new NotFoundException(id);
        }
        theLoaiRepository.deleteById(id);
        return "Xoa thanh cong the loai co id: " + id + ".";
    }
}