package ru.rrk.api.dto.seller;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Данные необходимые для создания нового продавца")
public record CreateSellerDTO(
        @Schema(description = "Имя продавца", example = "Иван Иванов")
        String name,
        @Schema(description = "Контактные данные", example = "+79999999999")
        String contactInfo
) {
}
