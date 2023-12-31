package j5_60.cinematicket.cinematicket.service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import j5_60.cinematicket.cinematicket.entity.LoaiGhe;
import j5_60.cinematicket.cinematicket.exception.ResourceNotFoundException;
import j5_60.cinematicket.cinematicket.repository.LoaiGheRepository;
import jakarta.transaction.Transactional;
@Service
@Transactional  
public class LoaiGheService {
    
    @Autowired
    public LoaiGheRepository loaiGheRepository;

    public List<LoaiGhe> sapXep() {
        return loaiGheRepository.findAllByOrderByTen();
    }
    public List<LoaiGhe> searchLoaiGhe(String keyword) {
        return loaiGheRepository.findByTenContainingIgnoreCase(keyword);
    }

    
    public List<LoaiGhe> getAll() {
        return loaiGheRepository.findAll();
    }

    
    public LoaiGhe save(LoaiGhe loaiGhe) {
        return loaiGheRepository.save(loaiGhe);
    }

    
    public LoaiGhe updateLoaiGhe(UUID id, LoaiGhe loaiGhe) throws ResourceNotFoundException {
        Optional<LoaiGhe> optionalLoaiGhe = loaiGheRepository.findById(id);
        if (optionalLoaiGhe.isPresent()) {
            LoaiGhe existingLoaiGhe = optionalLoaiGhe.get();
            existingLoaiGhe.setTen(loaiGhe.getTen());
            existingLoaiGhe.setTrangThai(loaiGhe.getTrangThai());
            existingLoaiGhe.setUpdateAt(LocalDateTime.now());
            // Cập nhật các thuộc tính khác của LoaiGhe

            return loaiGheRepository.save(existingLoaiGhe);
        }
        throw new ResourceNotFoundException("LoaiGhe not found with id: " + id);
    }

    
    public void deleteById(UUID id) {
        loaiGheRepository.deleteById(id);
    }

    
    public LoaiGhe findById(UUID id) throws ResourceNotFoundException {
        Optional<LoaiGhe> optionalLoaiGhe = loaiGheRepository.findById(id);
        if (optionalLoaiGhe.isPresent()) {
            return optionalLoaiGhe.get();
        }
        throw new ResourceNotFoundException("LoaiGhe not found with id: " + id);
    }}
