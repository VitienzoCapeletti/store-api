package com.store_api.dtos;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value,
                             Long senderId,
                             Long receiverId) {
}
