package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Administrator;

public class AdministratorFactory {
  public static Administrator getAdministrator(String userID, String firstName, String lastName, String email) {
      return new Administrator.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
  }
}


