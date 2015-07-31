package com.google.cloud.bigquery.samples.test;

import static org.junit.Assert.*;

import com.google.api.services.bigquery.model.GetQueryResultsResponse;
import com.google.cloud.bigquery.samples.SyncQuerySample;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


/**
 * TODO: Insert description here. (generated by elibixby)
 */
public class SyncQuerySampleTest extends BigquerySampleTest {

  /**
   * @throws JsonSyntaxException
   * @throws JsonIOException
   * @throws FileNotFoundException
   */
  public SyncQuerySampleTest() throws JsonSyntaxException, JsonIOException,
      FileNotFoundException {
    super();
  }

  @Test
  public void testSyncQuery() throws IOException{
    Iterator<GetQueryResultsResponse> pages = SyncQuerySample.run(
        CONSTANTS.getProjectId(),
        CONSTANTS.getQuery(),
        10000);
    while(pages.hasNext()){
      assertTrue(!pages.next().getRows().isEmpty());
    }
  }
  
}