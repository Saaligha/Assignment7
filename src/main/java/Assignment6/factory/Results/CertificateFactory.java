package Assignment6.factory.Results;

import Assignment6.domain.Results.Certificate;

public class CertificateFactory {

public static Certificate getCertificate(String certificate){
    return new Certificate.Builder().certificate(certificate).build();
}
}
