package domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_investor")
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    // Builders
    private Investor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static class InvestorBuilder {
        private String name;
        private String email;

        public InvestorBuilder() {
        }

        public InvestorBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public InvestorBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Investor build() {
            return new Investor(name, email);
        }
    }
}
