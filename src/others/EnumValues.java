package others;

public class EnumValues {
    public enum YesorNo {
        tak("tak"), nie("nie");

        public String answer;
        private YesorNo(String answer){
            this.answer=answer;
        }
    }

    public enum Bookgenres{
        basnie("baśnie"), poezja("poezja"), klasyka("klasyka"), przygodowa("przygodowa"),
        historyczna("historyczna"), popularnonaukowa("popularnonaukowa"), specjalistyczna("specjalistyczna");
        public String  value;
        private Bookgenres (String value){
            this.value=value;
        }
    }

    public enum Filmgenres{
        dramat("dramat"), komedia("komedia"), akcja("akcja"), animowany("animowany"),
        fantasy("fantasy"), SF("SF"), western("western");

        public String  value;
        private Filmgenres (String value){
            this.value=value;
        }
    }

    public enum Gamegenres{
        bijatyka("bijatyka"), strzelanka("strzelanka"), przygodowa("przygodowa"), logiczna("logiczna"),
        muzyczna("muzyczna");

        public String  value;
        private Gamegenres (String value){
            this.value=value;
        }
    }

}