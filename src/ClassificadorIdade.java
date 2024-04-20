public class ClassificadorIdade {

        public String classificarIdade(int idade) {
            if (idade < 0) {
                throw new IllegalArgumentException("Idade não pode ser negativa.");
            } else if (idade <= 12) {
                return "Criança";
            } else if (idade <= 17) {
                return "Adolescente";
            } else if (idade <= 64) {
                return "Adulto";
            } else {
                return "Idoso";
            }
        }
}

