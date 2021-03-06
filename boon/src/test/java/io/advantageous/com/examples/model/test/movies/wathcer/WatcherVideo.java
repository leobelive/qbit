/*
 * Copyright 2013-2014 Richard M. Hightower
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * __________                              _____          __   .__
 * \______   \ ____   ____   ____   /\    /     \ _____  |  | _|__| ____    ____
 *  |    |  _//  _ \ /  _ \ /    \  \/   /  \ /  \\__  \ |  |/ /  |/    \  / ___\
 *  |    |   (  <_> |  <_> )   |  \ /\  /    Y    \/ __ \|    <|  |   |  \/ /_/  >
 *  |______  /\____/ \____/|___|  / \/  \____|__  (____  /__|_ \__|___|  /\___  /
 *         \/                   \/              \/     \/     \/       \//_____/
 *      ____.                     ___________   _____    ______________.___.
 *     |    |____ ___  _______    \_   _____/  /  _  \  /   _____/\__  |   |
 *     |    \__  \\  \/ /\__  \    |    __)_  /  /_\  \ \_____  \  /   |   |
 * /\__|    |/ __ \\   /  / __ \_  |        \/    |    \/        \ \____   |
 * \________(____  /\_/  (____  / /_______  /\____|__  /_______  / / ______|
 *               \/           \/          \/         \/        \/  \/
 */

package io.advantageous.com.examples.model.test.movies.wathcer;


import io.advantageous.com.examples.model.test.movies.media.Movie;

import java.util.Date;

import static io.advantageous.boon.Boon.sputs;

public class WatcherVideo {


    /** Watcher associated with this media. */
    private Watcher watcher;

    /** LikeFactor of the media. */
    private int score;

    /** Last update time of media. */
    private final long time;

    /** Movie id. */
    protected final String id;

    /**
     * The media we are likeable.
     */
    private final Movie video;


    /**
     * New
     * @param video media the watcher is likeable for the playlist
     */
    private WatcherVideo(Movie video, Watcher watcher) {
        this.score = video.score();
        this.id = video.id();
        this.time = video.originalPublishDate();
        this.video = video;
        this.watcher = watcher;
    }




    /**
     * LikeFactor property.
     * @param s
     */
    public void setScore( int s ) {
        this.score = s;
    }


    /**
     * LikeFactor property.
     * @param s
     */
    public void incrementScore( int s ) {
        this.score += s;
    }

    public int getScore() {
        return score;
    }

    /** Movie we are recording a score for. */
    public final Movie video() {
        return video;
    }


    /**
     * Recency of the media, when was it last updated.
     * @return time
     */
    public final long time() {
        return time;
    }



    @Override
    public String toString() {
        return sputs ("score", this.score, "title", video.caption (), "time", new Date (this.time));
    }




    public Watcher getWatcher() {
        return watcher;
    }

    public void setWatcher(Watcher watcher) {
        this.watcher = watcher;
    }


}
