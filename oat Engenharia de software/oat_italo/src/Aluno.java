public class Aluno extends Pessoa {

        public String codigo;

        public Aluno(String nome){
            super(nome);
        }

        public Aluno(String nome, String codigo){
            super(nome);
            this.codigo = codigo;
        }
        public String getcodigo(){
            return this.codigo;
    }
    
    public void setcodigo(String codigo){
            this.codigo = codigo;
    }  

    }