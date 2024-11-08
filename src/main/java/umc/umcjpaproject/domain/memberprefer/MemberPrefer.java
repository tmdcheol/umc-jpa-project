package umc.umcjpaproject.domain.memberprefer;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.umcjpaproject.domain.common.BaseEntity;
import umc.umcjpaproject.domain.foodcategory.FoodCategory;
import umc.umcjpaproject.domain.member.Member;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberPrefer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "member_prefer_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "food_category_id")
    private FoodCategory foodCategory;

    @Builder
    public MemberPrefer(Member member, FoodCategory foodCategory) {
        this.member = member;
        this.foodCategory = foodCategory;
    }

}
