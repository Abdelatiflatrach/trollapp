package com.mooc.upload.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import com.mooc.domain.Authorization;
import com.mooc.domain.Course;
import com.mooc.domain.Learner;
import com.mooc.domain.Session;
import com.mooc.domain.Trainer;
import com.mooc.service.AuthorizationServiceRemote;
import com.mooc.service.CategoryServiceRemote;
import com.mooc.service.ChapterServiceRemote;
import com.mooc.service.CourseServiceRemote;
import com.mooc.service.LearnerServiceRemote;
import com.mooc.service.SessionServiceRemote;
import com.mooc.service.TrainerServiceRemote;

@Startup
@Singleton
public class FillDatabaseData {

	// EJB Services
	@EJB
	public AuthorizationServiceRemote authorizationService;
	@EJB
	public LearnerServiceRemote learnerService;
	@EJB
	public TrainerServiceRemote trainerService;
	@EJB
	public SessionServiceRemote sessionService;
	@EJB
	public ChapterServiceRemote chapterService;
	@EJB
	public CourseServiceRemote courseService;
	@EJB
	public CategoryServiceRemote categoryService;

	// Fill database
	@PostConstruct
	public void FillData() {

		// Entity Authorization for Learner <<Sami>>
		authorizationService.create(new Authorization("sami.karbia@gmail.com", "0000", "LEARNER"));
		Authorization a = authorizationService.findByEmail("sami.karbia@gmail.com");

		// Entity Learner
		Learner learner = new Learner("Sami", "Karbia", "55001122", "10 Rue Paris", a);
		learnerService.create(learner);

		// Entity Authorization for Trainer <<William>>
		authorizationService.create(new Authorization("william.boldak@gmail.com", "0000", "TRAINER"));
		a = authorizationService.findByEmail("william.boldak@gmail.com");

		// Entity Trainer
		Trainer trainer = new Trainer("William", "Boldak", "98653214", "10 Street Apolo", a, null);
		trainerService.create(trainer);
		a = authorizationService.findByEmail("william.boldak@gmail.com");

		// Entity Session
		trainer = trainerService.findById(2);
		sessionService.create(new Session("JAVA", "Java programming", new Date(), new Date(), trainer));
		sessionService.create(new Session("PHP", "PHP programming", new Date(), new Date(), trainer));
		sessionService.create(new Session(".NET", ".NET programming", new Date(), new Date(), trainer));
		sessionService.create(new Session("SQL", "SQL programming", new Date(), new Date(), trainer));
		sessionService.create(new Session("jQuery", "jQuery programming", new Date(), new Date(), trainer));
		sessionService.create(new Session("AngularJS", "AngularJS programming", new Date(), new Date(), trainer));

		// Entities Courses for session JAVA (id=1)
		Session sjava = sessionService.findById(1);
		sessionService.update(sjava);
		courseService.create(new Course("Java Course S1", new Date(), null, null, sjava));
		courseService.create(new Course("Java Course S2", new Date(), null, null, sjava));
		courseService.create(new Course("Java Course S3", new Date(), null, null, sjava));
		courseService.create(new Course("Java Course S4", new Date(), null, null, sjava));

		// Entities Courses for session JAVA (id=1)
		Session sphp = sessionService.findById(2);
		courseService.create(new Course("PHP Course S1", new Date(), null, null, sphp));
		courseService.create(new Course("PHP Course S2", new Date(), null, null, sphp));
		courseService.create(new Course("PHP Course S3", new Date(), null, null, sphp));
		courseService.create(new Course("PHP Course S4", new Date(), null, null, sphp));
		
		//Learners follow many sessions
		//List<Learner>  learnes = new ArrayList<Learner>();
		List<Session> sessions = new ArrayList<Session>();
		sessions.add(sjava);
		sessions.add(sphp);
		learner = learnerService.findById(1);
		learner.setSessions(sessions);
		learnerService.update(learner);

	}

	public FillDatabaseData() {
		super();
		// TODO Auto-generated constructor stub
	}
}
