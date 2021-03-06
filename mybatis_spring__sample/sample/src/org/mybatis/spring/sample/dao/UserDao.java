/*
 *    Copyright 2010 The myBatis Team
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.spring.sample.dao;

import org.mybatis.spring.sample.domain.User;

/**
 * A org.mybatis.spring sample mapper. This interface will be used by MapperFactoryBean to create a
 * proxy implementation at Spring application startup.
 * 
 * @version $Id: UserDao.java 3286 2010-11-24 21:47:56Z eduardo.macarron $
 */
public interface UserDao {

    User getUser(String userId);

}
