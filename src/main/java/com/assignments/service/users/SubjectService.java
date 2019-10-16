package za.ac.cput.service.users;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.users.Location;
import za.ac.cput.domain.users.Subject;
import za.ac.cput.repository.users.UniversityRepository;
import za.ac.cput.service.IService;

import java.util.HashSet;
import java.util.Set;

public interface SubjectService extends IService<Subject, String> {

    Set<Subject> getAll();

    @Repository("UniversityInMemory")
    class LocationRepositoryImpl implements UniversityRepository {

        private static LocationRepositoryImpl repository = null;
        private Set<Location> locations;

        public LocationRepositoryImpl(){
            locations = new HashSet<>();
        }


        public static LocationRepositoryImpl getRepository() {

            if(repository == null){
                return new LocationRepositoryImpl();
            }
            return repository;
        }

        @Override
        public Location create(Location location) {

            locations.add(location);
            return location;
        }

        @Override
        public Location read(String id) {

            return locations.stream().filter(university -> university.getUniversityID().equals(id)).findAny().orElse(null);
        }

        @Override
        public Location update(Location location) {

            Location inDB = read(location.getUniversityID());

            if(inDB != null){
                locations.remove(inDB);
                locations.add(location);
                return location;
            }

            return null;
        }

        @Override
        public void delete(String id) {

            Location inDB = read(id);
            locations.remove(inDB);

        }

        @Override
        public Set<Location> getAll() {
            return locations;
        }

    }
}