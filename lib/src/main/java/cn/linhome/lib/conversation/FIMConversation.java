/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.linhome.lib.conversation;

/**
 * IM会话
 */
public interface FIMConversation
{
    /**
     * 会话id
     *
     * @return
     */
    String getPeer();

    /**
     * 会话类型
     *
     * @return
     */
    FIMConversationType getType();

    /**
     * 该会话的未读数量
     *
     * @return
     */
    long getUnreadMessageNum();
}