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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Kerberos Key Distribution Center</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Kerberos KDC.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_KerberosKeyDistributionCenter#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KerberosKeyDistributionCenter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::User::Kerberos' override.Name='string' override.Name.Description='The Realm served by this KDC.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_KerberosKeyDistributionCenter extends CIM_CredentialManagementService {
	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of Kerberos supported by this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_KerberosKeyDistributionCenter_Protocol()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"V4\",\"V5\",\"DCE\",\"MS\"]'"
	 * @generated
	 */
	EList<Integer> getProtocol();

} // CIM_KerberosKeyDistributionCenter
