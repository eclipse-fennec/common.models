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
 * A representation of the model object '<em><b>CIM J2ee JMS Connection Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJMSConnectionStats class defines the performance statistics that are provided by a JMS connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSConnectionStats#getIsTransactional <em>Is Transactional</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSConnectionStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJMSConnectionStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Is Transactional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transactional state of the JMS connection. A value of true indicates that the JMS connection is transactional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Transactional</em>' attribute.
	 * @see #setIsTransactional(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSConnectionStats_IsTransactional()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"JSR77.JCP|JSR77.6.25.1.2 isTransactional|V1.0\"]'"
	 * @generated
	 */
	Boolean getIsTransactional();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSConnectionStats#getIsTransactional <em>Is Transactional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Transactional</em>' attribute.
	 * @see #getIsTransactional()
	 * @generated
	 */
	void setIsTransactional(Boolean value);

} // CIM_J2eeJMSConnectionStats
