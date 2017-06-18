package com.javaproject.pashnim.cinema.WebInterfaces;

import com.javaproject.pashnim.cinema.Objects.MovieDetails;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Nimrod on 15/06/2017.
 */

public interface MoviesServiceAPI
{
    // Movies
    @GET(WebApiConstants.Movies.RelativeUrl)
    Call<List<MovieDetails>> GetAllMovies();

    @GET(WebApiConstants.Movies.GetMovie)
    Call<MovieDetails> GetMovie(@Path(WebApiConstants.Movies.MovieId) int id);

    @POST(WebApiConstants.Movies.RelativeUrl)
    Call<ResponseBody> AddMovie(@Body MovieDetails movie);

    @GET(WebApiConstants.Images.RelativeGetImage)
    Call<ResponseBody> GetMoviePicture(@Path(WebApiConstants.Images.ImageName) String name);
}
