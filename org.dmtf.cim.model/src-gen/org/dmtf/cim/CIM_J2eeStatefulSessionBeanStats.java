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
 * A representation of the model object '<em><b>CIM J2ee Stateful Session Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The J2eeStatefulSessionBeanStats class defines the performance statistics that are provided by a stateful session bean.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveCount <em>Passive Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveLowWaterMark <em>Passive Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveHighWaterMark <em>Passive High Water Mark</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeStatefulSessionBeanStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeStatefulSessionBeanStats extends CIM_J2eeSessionBeanStats {
	/**
	 * Returns the value of the '<em><b>Passive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bean instances in a passive state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Count</em>' attribute.
	 * @see #setPassiveCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeStatefulSessionBeanStats_PassiveCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.15.1.1 getPassiveCount|V1.0\"]'"
	 * @generated
	 */
	Long getPassiveCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveCount <em>Passive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Count</em>' attribute.
	 * @see #getPassiveCount()
	 * @generated
	 */
	void setPassiveCount(Long value);

	/**
	 * Returns the value of the '<em><b>Passive Low Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lowest number of bean instances in the passive state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive Low Water Mark</em>' attribute.
	 * @see #setPassiveLowWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeStatefulSessionBeanStats_PassiveLowWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.2 getLowWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPassiveLowWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveLowWaterMark <em>Passive Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Low Water Mark</em>' attribute.
	 * @see #getPassiveLowWaterMark()
	 * @generated
	 */
	void setPassiveLowWaterMark(Long value);

	/**
	 * Returns the value of the '<em><b>Passive High Water Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The highest number of bean instances in the passive state since the beginning of the measurement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Passive High Water Mark</em>' attribute.
	 * @see #setPassiveHighWaterMark(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeStatefulSessionBeanStats_PassiveHighWaterMark()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"JSR77.JCP|JSR77.6.7.1.1 getHighWaterMark|V1.0\"]'"
	 * @generated
	 */
	Long getPassiveHighWaterMark();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats#getPassiveHighWaterMark <em>Passive High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive High Water Mark</em>' attribute.
	 * @see #getPassiveHighWaterMark()
	 * @generated
	 */
	void setPassiveHighWaterMark(Long value);

} // CIM_J2eeStatefulSessionBeanStats
