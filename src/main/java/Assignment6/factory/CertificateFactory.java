package Assignment6.factory;

import Assignment6.domain.Certificate;

public class CertificateFactory {

public static Certificate getCertificate(String certificate){
    return new Certificate.Builder().certificate("Diploma").build();
}
}
