/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.filter.xar2.internal.input;

import javax.inject.Named;
import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.filter.input.AbstractBeanInputFilterStreamFactory;
import org.xwiki.filter.xar2.input.XAR2InputProperties;
import org.xwiki.filter.xar2.internal.XAR2FilterStreamType;
import org.xwiki.filter.xar2.internal.XAR2FilterUtils;

/**
 * Generate events from XAR FilterStream package.
 * 
 * @version $Id$
 * @since 6.2M1
 */
@Component
@Named(XAR2FilterUtils.ROLEHINT)
@Singleton
public class XAR2InputFilterStreamFactory extends
    AbstractBeanInputFilterStreamFactory<XAR2InputProperties, XAR2InputFilter>
{
    public XAR2InputFilterStreamFactory()
    {
        super(XAR2FilterStreamType.XWIKI_XAR_20);

        setName("XAR2 input stream");
        setDescription("Generates wiki events from XAR2 package.");
    }
}