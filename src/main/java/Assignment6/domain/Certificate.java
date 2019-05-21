package Assignment6.domain;

import javafx.util.Builder;

public class Certificate {

private String certificate;

private Certificate(){

}

private Certificate(Builder builder){

}

public String getCertificate(){
    return certificate;
}

public Certificate certificate(String certificate){
    this.certificate=certificate;
    return this;
}

public static class Builder{

    private String certificate;

    public Builder certificate(String certificate){
        this.certificate=certificate;
        return this;
    }

    public Certificate build(){return new Certificate(this);}
}
}
