package unidade5.heranca;

public class Professor extends Pessoa{
    // polimorfismo = pego algo que nao me serve para professor e o altero para professor
    // profissão de professor será sempre professor
    // polimorfismo depende de herança -> porque se não tenho o método na superclasse nao tenho como usa-la na subclasse
    public String getProfissao(){
        super.setProfissao("Professor");
        return super.getProfissao();
    }
}
