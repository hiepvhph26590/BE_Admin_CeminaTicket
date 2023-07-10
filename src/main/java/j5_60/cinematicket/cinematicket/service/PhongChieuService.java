package j5_60.cinematicket.cinematicket.service;

import j5_60.cinematicket.cinematicket.entity.PhongChieu;
import j5_60.cinematicket.cinematicket.exception.ResourceNotFoundException;

import java.util.List;
import java.util.UUID;

public interface PhongChieuService {
    List<PhongChieu> getAll();

    PhongChieu save(PhongChieu phongChieu);

    PhongChieu updatePhongChieu(UUID id, PhongChieu phongChieu) throws ResourceNotFoundException;

    void deleteById(UUID id);

    PhongChieu findById(UUID id) throws ResourceNotFoundException;
}
