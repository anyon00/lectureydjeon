package lectureydjeon;

import org.springframework.data.repository.PagingAndSortingRepository;

// @RepositoryRestResource(collectionResourceRel="courses", path="courses")
public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{


}
