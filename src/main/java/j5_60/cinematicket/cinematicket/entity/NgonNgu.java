package j5_60.cinematicket.cinematicket.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "NgonNgu")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class NgonNgu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

//    @Column(name = "create_by")
//    private UUID createById;
//
//    @Column(name = "update_by")
//    private UUID updateById;

    @Column(name = "deleted")
    private Integer deleted;
}