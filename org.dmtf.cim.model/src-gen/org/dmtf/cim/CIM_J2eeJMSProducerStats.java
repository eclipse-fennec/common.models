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
 * A representation of the model object '<em><b>CIM J2ee JMS Producer Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJMSProducerStats class defines the performance statistics that are provided by a JMS message producer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJMSProducerStats#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSProducerStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJMSProducerStats extends CIM_J2eeJMSEndpointStats {
	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that encapsulates the identity of the message destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJMSProducerStats_Destination()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"JSR77.JCP|JSR77.6.28.1.1 getDestination|V1.0\"]'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJMSProducerStats#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

} // CIM_J2eeJMSProducerStats
