package ru.rrk.core.entity.transaction;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import ru.rrk.core.entity.Seller;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private Seller seller;

    private Float amount;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;

    @CreationTimestamp
    private LocalDateTime transactionDate;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Transaction that)) return false;

        if (getId() == null || that.getId() == null) {
            return Objects.equals(getSeller(), that.getSeller()) &&
                   Objects.equals(getAmount(), that.getAmount()) &&
                   Objects.equals(getTransactionDate(), that.getTransactionDate()) &&
                   getPaymentType() == that.getPaymentType();
        }
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSeller(), getAmount(), getPaymentType(), getTransactionDate());
    }
}
