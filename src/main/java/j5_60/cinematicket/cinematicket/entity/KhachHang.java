package j5_60.cinematicket.cinematicket.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "KhachHang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private UUID id;

    @Column(name="ho_ten")
    private String hoTen;

    @Column(name="email")
    private String email;

    @Column(name="mat_khau")
    private String pass;

    @Column(name="gioi_tinh")
    private boolean gioiTinh;

    @Column(name="ngay_sinh")
    private Date ngaySinh;

    @Column(name="so_dien_thoai")
    private String sdt;

    @Column(name="trang_thai")
    private int trangThai;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "update_by")
    private UUID updateBy;

    @Column(name = "create_by")
    private UUID createBy;

    @Column(name = "deleted")
    private boolean deleted;
}
