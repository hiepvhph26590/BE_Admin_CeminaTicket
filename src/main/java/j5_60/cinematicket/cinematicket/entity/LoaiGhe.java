package j5_60.cinematicket.cinematicket.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LoaiGhe")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoaiGhe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "trang_thai")
    private int trangThai;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "create_by")
    private UUID createBy;

    @Column(name = "update_by")
    private UUID updateBy;

    @Column(name = "deleted")
    private boolean deleted;

    // Other attributes and relationships specific to the "LoaiGhe" entity

    // Getters and setters, as well as any additional methods
}
