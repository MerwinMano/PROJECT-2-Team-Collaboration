package mer.mano.dao;

import java.util.List;

import mer.mano.model.Job;


public interface JobDao {
void addJob(Job job);
List<Job> getAllJobs();
Job getJob(int id);
}
