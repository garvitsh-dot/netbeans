/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.web.monitor.data;

import java.beans.PropertyChangeListener;
import java.util.Vector;

import org.netbeans.modules.schema2beans.BaseBean;
import org.netbeans.modules.schema2beans.BeanComparator;
import org.netbeans.modules.schema2beans.BeanProp;
import org.netbeans.modules.schema2beans.Common;
import org.netbeans.modules.schema2beans.Version;

public class Param extends BaseBean {

    static Vector<BeanComparator> comparators = new Vector<>();


    public Param() {
	this(Common.USE_DEFAULT_VALUES);
    }

    public Param(String name, String value) {
	super(Param.comparators, new Version(1, 0, 6));
	setAttributeValue("name", name); //NOI18N
	setAttributeValue("value", value); //NOI18N
    }

    public Param(int options) {
	super(Param.comparators, new Version(1, 0, 6));
	// Properties (see root bean comments for the bean graph)
	this.initialize(options);
    }


    public String getName() {
	return getAttributeValue("name"); // NOI18N
    }
    public void   setName(String value) {
	setAttributeValue("name", value); // NOI18N
    }

    public String getValue() {
	return getAttributeValue("value"); // NOI18N
    }
    public void   setValue(String value) {
	setAttributeValue("value", value); // NOI18N
    }


    // Setting the default values of the properties
    void initialize(int options) {

    }

    // This method verifies that the mandatory properties are set
    public boolean verify() {
	return true;
    }

    //
    static public void addComparator(BeanComparator c) {
	Param.comparators.add(c);
    }

    //
    static public void removeComparator(BeanComparator c) {
	Param.comparators.remove(c);
    }
    //
    public void addPropertyChangeListener(PropertyChangeListener l) {
	BeanProp p = this.beanProp();
	if (p != null)
	    p.addPCListener(l);
    }

    //
    public void removePropertyChangeListener(PropertyChangeListener l) {
	BeanProp p = this.beanProp();
	if (p != null)
	    p.removePCListener(l);
    }

    //
    public void addPropertyChangeListener(String n, PropertyChangeListener l) {
	BeanProp p = this.beanProp(n);
	if (p != null)
	    p.addPCListener(l);
    }

    //
    public void removePropertyChangeListener(String n,
					     PropertyChangeListener l) {
	BeanProp p = this.beanProp(n);
	if (p != null)
	    p.removePCListener(l);
    }

    // Dump the content of this bean returning it as a String
    public void dump(StringBuffer str, String indent) {
	String s;
	BaseBean n;
    }

    public String dumpBeanNode() {
	StringBuffer str = new StringBuffer();
	str.append("Param\n"); //NOI18N
	this.dump(str, "\n  "); //NOI18N
	return str.toString();
    }
}

