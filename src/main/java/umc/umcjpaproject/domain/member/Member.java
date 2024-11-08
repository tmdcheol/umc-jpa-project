package umc.umcjpaproject.domain.member;

import static jakarta.persistence.EnumType.STRING;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.umcjpaproject.domain.common.BaseEntity;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    private Integer age;

    @Column(nullable = false, length = 40)
    private String address;

    @Column(nullable = false, length = 40)
    private String specAddress;

    @Enumerated(STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private MemberStatus status;

    private LocalDate inactiveDate;

    @Enumerated(STRING)
    private SocialType socialType;

    @Column(nullable = false, length = 50)
    private String email;

    private Integer point;

    @Builder
    public Member(String name, Gender gender, Integer age, String address, String specAddress,
            MemberStatus status, LocalDate inactiveDate, SocialType socialType, String email,
            Integer point) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.specAddress = specAddress;
        this.status = status;
        this.inactiveDate = inactiveDate;
        this.socialType = socialType;
        this.email = email;
        this.point = point;
    }
}
