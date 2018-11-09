package zm.gov.moh.core.repository.api;

import android.arch.lifecycle.LiveData;

import java.util.List;

import io.reactivex.functions.Consumer;
import zm.gov.moh.core.repository.api.rest.RestApi;
import zm.gov.moh.core.repository.database.dao.domain.PersonAddressDao;
import zm.gov.moh.core.repository.database.dao.domain.PersonAttributeDao;
import zm.gov.moh.core.repository.database.dao.domain.PersonAttributeTypeDao;
import zm.gov.moh.core.repository.database.dao.domain.PersonDao;
import zm.gov.moh.core.repository.database.dao.domain.PersonNameDao;
import zm.gov.moh.core.repository.database.entity.derived.Client;
import zm.gov.moh.core.repository.database.entity.domain.Person;
import zm.gov.moh.core.repository.database.entity.domain.PersonAddress;
import zm.gov.moh.core.repository.database.entity.domain.PersonName;


public interface Repository {

    RestApi getRestApi(String token);
    PersonDao getPersonDao();
    PersonNameDao getPersonNameDao();
    PersonAddressDao getPersonAddressDao();
    PersonAttributeDao getPersonAttributeDao();
    PersonAttributeTypeDao getPersonAttributeTypeDao();

    void insertPerson(Person person);

    void insertPersonName(PersonName personName);

    void insertPersonAdress(PersonAddress personAddress);

    LiveData<List<Person>> getAllPersons();

    LiveData<List<Client>> getAllClients();

    LiveData<Client> getClientById(long id);

    LiveData<PersonAddress> getPersonAddressByPersonId(long id);

    LiveData<List<Client>> findClientByTerm(String term);
}
