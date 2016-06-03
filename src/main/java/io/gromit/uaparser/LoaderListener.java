package io.gromit.uaparser;

/**
 * The listener interface for receiving loader events.
 * The class that is interested in processing a loader
 * event implements this interface, and the object created
 * with that class is registered with a component using the
 * component's <code>addLoaderListener<code> method. When
 * the loader event occurs, that object's appropriate
 * method is invoked.
 *
 * @see LoaderEvent
 */
public interface LoaderListener {

	/**
	 * Success.
	 *
	 * @param url the url
	 */
	void success(String url);
	
	/**
	 * Failure.
	 *
	 * @param url the url
	 * @param e the e
	 */
	void failure(String url, Exception e);
	
}
