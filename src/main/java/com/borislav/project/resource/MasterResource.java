package com.borislav.project.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.borislav.project.model.MasterTest;
import com.borislav.project.model.ServiceTest;
import com.borislav.project.model.Services;
import com.borislav.project.provider.MyJsonProvider;

@Path("/master")
public class MasterResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/post/master")
	public MasterTest postMessage(MasterTest master) throws Exception {
		String email = "hello world";
		String password = "hello";
		String name = "hello";
		String lastName = "hello";
		String phoneNumber = "8876578766L";
		String info = "hello";
		ArrayList<ServiceTest> services = new ArrayList<ServiceTest>();
		ArrayList<String> arrLocations = new ArrayList<String>();
		ArrayList<String> languages = new ArrayList<String>();
		arrLocations.add("hello");
		languages.add("English");
		long time = 230984273l;
		float priceMin = 2343.0F;
		float priceMax = -1.0F;
		String servInfo = "hello";
		ServiceTest service = new ServiceTest(lastName, time, priceMin, priceMax, servInfo);
		MasterTest master1 = new MasterTest(email, password, name, lastName, phoneNumber);
		master1.addService(service);
		services.add(service);
		master1.setServices(services);
		master1.setArrLocations(arrLocations);
		master1.setLanguages(languages);

		// master1.setEmail("No class");
		// master1.setLastName("No class");
		// master1.setName("No class");
		// master1.setPassword("No class");

		return master;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/post/services")
	public Services addServiceToMaster(Services services1) throws Exception {
		// List<Service> serv = services1.getServices();

		String email = "hello world";
		String password = "hello";
		String name = "hello";
		String lastName = "hello";
		String phoneNumber = "8876578766L";
		String info = "hello";
		ArrayList<ServiceTest> services = new ArrayList<ServiceTest>();
		ArrayList<String> arrLocations = new ArrayList<String>();
		ArrayList<String> languages = new ArrayList<String>();
		arrLocations.add("hello");
		languages.add("English");
		long time = 230984273l;
		float priceMin = 2343.0F;
		float priceMax = -1.0F;
		String servInfo = "hello";
		ServiceTest service = new ServiceTest(lastName, time, priceMin, priceMax, servInfo);
		MasterTest master1 = new MasterTest(email, password, name, lastName, phoneNumber);
		Services serv1 = new Services();
		services.add(service);
		services.add(service);
		services.add(service);

		serv1.setServices(services);
		master1.addService(service);
		services.add(service);
		master1.setServices(services);
		master1.setArrLocations(arrLocations);
		master1.setLanguages(languages);

		return serv1;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/register/master")
	public Response registerMaster(MasterTest master) {
		try {
			if (master != null) {
				if (master.getEmail() != null && master.getName() != null && master.getPassword() != null
						&& master.getLastName() != null && master.getPhoneNumber() != null) {
					return Response.ok().build();
				}
				return Response.status(Response.Status.PARTIAL_CONTENT).build();

			}
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}

		return Response.status(Response.Status.NO_CONTENT).build();

	}

}
