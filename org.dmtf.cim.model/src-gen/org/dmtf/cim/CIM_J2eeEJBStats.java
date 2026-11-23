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
 * A representation of the model object '<em><b>CIM J2ee EJB Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeEJBStats class defines the performance statistics that are available for all EJB component types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEJBStats#getCreateCount <em>Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeEJBStats#getRemoveCount <em>Remove Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEJBStats()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeEJBStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Create Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the number of times that the beans create method was called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Count</em>' attribute.
	 * @see #setCreateCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEJBStats_CreateCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.11.1.1 getCreateCount|V1.0\"]'"
	 * @generated
	 */
	Long getCreateCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEJBStats#getCreateCount <em>Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Count</em>' attribute.
	 * @see #getCreateCount()
	 * @generated
	 */
	void setCreateCount(Long value);

	/**
	 * Returns the value of the '<em><b>Remove Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A count of the number of times that the beans remove method was called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remove Count</em>' attribute.
	 * @see #setRemoveCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeEJBStats_RemoveCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.11.1.2 getRemoveCount|V1.0\"]'"
	 * @generated
	 */
	Long getRemoveCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeEJBStats#getRemoveCount <em>Remove Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Count</em>' attribute.
	 * @see #getRemoveCount()
	 * @generated
	 */
	void setRemoveCount(Long value);

} // CIM_J2eeEJBStats
