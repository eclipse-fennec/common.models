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
 * A representation of the model object '<em><b>CIM J2ee JTA Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_J2eeJTAStats class defines the performance statistics that are provided by a JTA resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJTAStats#getActiveCount <em>Active Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJTAStats#getCommittedCount <em>Committed Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_J2eeJTAStats#getRolledbackCount <em>Rolledback Count</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJTAStats()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Application::J2eeAppServerStats' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_J2eeJTAStats extends CIM_J2eeStatistic {
	/**
	 * Returns the value of the '<em><b>Active Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of active transactions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Count</em>' attribute.
	 * @see #setActiveCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJTAStats_ActiveCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.30.1.1 getActiveCount|V1.0\"]'"
	 * @generated
	 */
	Long getActiveCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJTAStats#getActiveCount <em>Active Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Count</em>' attribute.
	 * @see #getActiveCount()
	 * @generated
	 */
	void setActiveCount(Long value);

	/**
	 * Returns the value of the '<em><b>Committed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of committed transactions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Committed Count</em>' attribute.
	 * @see #setCommittedCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJTAStats_CommittedCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.30.1.2 getCommittedCount|V1.0\"]'"
	 * @generated
	 */
	Long getCommittedCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJTAStats#getCommittedCount <em>Committed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed Count</em>' attribute.
	 * @see #getCommittedCount()
	 * @generated
	 */
	void setCommittedCount(Long value);

	/**
	 * Returns the value of the '<em><b>Rolledback Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of rolled-back transactions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rolledback Count</em>' attribute.
	 * @see #setRolledbackCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_J2eeJTAStats_RolledbackCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"JSR77.JCP|JSR77.6.30.1.3 getRolledbackCount|V1.0\"]'"
	 * @generated
	 */
	Long getRolledbackCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_J2eeJTAStats#getRolledbackCount <em>Rolledback Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolledback Count</em>' attribute.
	 * @see #getRolledbackCount()
	 * @generated
	 */
	void setRolledbackCount(Long value);

} // CIM_J2eeJTAStats
