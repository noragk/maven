package org.apache.maven.reactor;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.File;
import java.io.IOException;

import org.apache.maven.project.ProjectBuildingException;

/**
 * @author Jason van Zyl
 * @version $Id$
 */
public class MavenExecutionException
    extends Exception
{
    private File pomFile;

    public MavenExecutionException( String message, File pomFile )
    {
        super( message );
        this.pomFile = pomFile;
    }

    public MavenExecutionException( String message, File pomFile, ProjectBuildingException cause )
    {
        super( message, cause );
        this.pomFile = pomFile;
    }

    public MavenExecutionException( String message, IOException cause )
    {
        super( message, cause );
    }

    public MavenExecutionException( String message,
                                    ProjectBuildingException cause )
    {
        super( message, cause );
    }

    public File getPomFile()
    {
        return pomFile;
    }
}
