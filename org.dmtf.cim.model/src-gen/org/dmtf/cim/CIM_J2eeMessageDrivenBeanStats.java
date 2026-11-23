/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM J2ee Message Driven Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeMessageDrivenBeanStats class defines the performance statistics that are provided by message driven beans.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeMessageDrivenBeanStats#getMessageCount <em>Message Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeMessageDrivenBeanStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeMessageDrivenBeanStats extends CIM_J2eeEJBStats {
	/**
	 * Returns the value of the '<em><b>Message Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of messages received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Count</em>' attribute.
	 * @see #setMessageCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeMessageDrivenBeanStats_MessageCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.13.1.1 getMessageCount|V1.0\"]'"
	 * @generated
	 */
	Long getMessageCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeMessageDrivenBeanStats#getMessageCount <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Count</em>' attribute.
	 * @see #getMessageCount()
	 * @generated
	 */
	void setMessageCount(Long value);

} // CIM_J2eeMessageDrivenBeanStats
