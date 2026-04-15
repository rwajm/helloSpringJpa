package kr.ac.hansung.cse.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * =====================================================================
 * CategoryForm - 카테고리 관리 폼 DTO
 * =====================================================================
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryForm {
    /**
     * 카테고리명
     */
    @NotBlank(message = "카테고리 이름을 입력하세요")
    @Size(max = 50, message = "50자 이내로 입력하세요")
    private String name;

    // ─────────────────────────────────────────────────────────────────
    // 변환 메서드 (DTO ↔ Entity)
    // ─────────────────────────────────────────────────────────────────

    /**
     * CategoryForm → Category 엔티티 변환
     */
    public Category toEntity() {
        return new Category(this.name);
    }

}
