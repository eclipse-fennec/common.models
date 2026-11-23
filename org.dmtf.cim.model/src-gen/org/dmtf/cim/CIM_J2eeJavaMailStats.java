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
 * A representation of the model object '<em><b>CIM J2ee Java Mail Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeJavaMailStats class defines the performance statistics that are provided by Java mail resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJavaMailStats#getSentMailCount <em>Sent Mail Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJavaMailStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJavaMailStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Sent Mail Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of mail messages received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sent Mail Count</em>' attribute.
	 * @see #setSentMailCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJavaMailStats_SentMailCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.13.1.1 getSentMailCount|V1.0\"]'"
	 * @generated
	 */
	Long getSentMailCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJavaMailStats#getSentMailCount <em>Sent Mail Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sent Mail Count</em>' attribute.
	 * @see #getSentMailCount()
	 * @generated
	 */
	void setSentMailCount(Long value);

} // CIM_J2eeJavaMailStats
