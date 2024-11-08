package umc.umcjpaproject.domain.region;

import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.umcjpaproject.domain.common.BaseEntity;

@Entity
@Getter
@NoArgsConstructor(access = PROTECTED)
public class Region extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "region_id")
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String name;

    @Builder
    public Region(String name) {
        this.name = name;
    }
}
