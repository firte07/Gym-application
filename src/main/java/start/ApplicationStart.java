package start;

import controller.LoginController;
import entity.*;
import repository.*;
import service.ClientService;
import service.ScheduleService;
import view.LoginView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class ApplicationStart {

    public static void main(String[] args) {

/*       TrainerRepo tr = new TrainerRepo();

        Trainer trainer = new Trainer();
        trainer.setIdTrainer(UUID.randomUUID().toString());


        Profile profile = new Profile();
        profile.setId(UUID.randomUUID().toString());
        profile.setName("grigor");
        profile.setType("trainer");
        profile.setCertification("yoga");
        trainer.setProfile(profile);
        //end test firte

        //test colce
        trainer.setTrainerCredentials("trainer", "sweat_for_me");
        tr.insertNewTrainer(trainer);

        Schedule schedule = new Schedule();
        schedule.setIdClass(UUID.randomUUID().toString());
        schedule.setClassName("yoga");
        schedule.setTemp(LocalDateTime.now().plusDays(1000));
        //schedule.setTrainer(trainer);


        ClientRepo clientRepo = new ClientRepo();
        Client client = new Client();
        client.setIdClient(UUID.randomUUID().toString());
        client.setClientCredentials("client_username", "unsimpluclient_kek");
        ProfileRepo pr = new ProfileRepo();


        Profile profile1 = new Profile();
        profile1.setId(UUID.randomUUID().toString());
        profile1.setName("Popescu Ioan");
        profile1.setType("ClientProfile");

        Client client2 = new Client();
        client2.setIdClient(UUID.randomUUID().toString());
        client2.setClientCredentials("client_username2", "parolaproasta");


        Profile profile2 = new Profile();
        profile2.setId(UUID.randomUUID().toString());
        profile2.setName("Popescu Ioan");
        profile2.setType("ClientProfile");

        pr.insertNewProfile(profile1);
        pr.insertNewProfile(profile2);
        clientRepo.insertNewClient(client2);
        clientRepo.insertNewClient(client);

        LoginRepo lr = new LoginRepo();
        lr.insertNewLogin(new Login("123123", "usrNeim", "pass", "typlm"));

        RatingRepo rairep = new RatingRepo();

        Client firstClient = new Client();
        firstClient.setIdClient(UUID.randomUUID().toString());
        firstClient.setClientCredentials("client_bla", "ubla");

        Profile secondProfile = new Profile();
        secondProfile.setId(UUID.randomUUID().toString());
        secondProfile.setName("Ionescu Adrian");
        secondProfile.setType("client");
        secondProfile.setBirthday("30.04.1992");
        secondProfile.setSex("M");

        firstClient.setProfile(secondProfile);

        clientRepo.insertNewClient(firstClient);

        ScheduleRepo scheduleRepo = new ScheduleRepo();
        List<Schedule> schedules = scheduleRepo.findAllSchedule();

        //test bianca


        Schedule schedule1 = new Schedule();
        schedule1.setIdClass(UUID.randomUUID().toString());
        schedule1.setClassName("yoga");
        schedule1.setTemp(LocalDateTime.now().plusMinutes(1));
        schedule1.setTrainer(trainer);



        ScheduleService ss = new ScheduleService();
        ss.insertSchedule(schedule1, schedule1.getTemp());

        ClientService clientService = new ClientService();
        clientService.modifyName(firstClient.getIdClient(), "Blabla Nume");
        clientService.modifyPassword(firstClient.getIdClient(), "1231");
        clientService.createMembership(firstClient.getIdClient(), "Gold");
        clientService.createBooking(firstClient.getIdClient(), schedule1);
        clientService.rateTrainer(client2.getIdClient(), 5, trainer);
        clientService.rateTrainer(client.getIdClient(), 3, trainer);

*/
        LoginController.run();
        new LoginView();

    }
}
