package net.brilliance.service.api.config;

import org.springframework.data.domain.Page;

import net.brilliance.domain.entity.config.Configuration;
import net.brilliance.framework.model.SearchParameter;
import net.brilliance.framework.service.GenericService;
import net.brilliance.service.api.ObjectNotFoundException;

public interface ConfigurationService extends GenericService<Configuration, Long> {

	/**
	 * Get one Configuration with the provided name.
	 * 
	 * @param code
	 *            The Configuration name
	 * @return The Configuration
	 * @throws ObjectNotFoundException
	 *             If no such Configuration exists.
	 */
	Configuration getOne(String name) throws ObjectNotFoundException;

	/**
	 * Get one Configurations with the provided search parameters.
	 * 
	 * @param searchParameter
	 *            The search parameter
	 * @return The pageable Configurations
	 */
	Page<Configuration> getObjects(SearchParameter searchParameter);
}
