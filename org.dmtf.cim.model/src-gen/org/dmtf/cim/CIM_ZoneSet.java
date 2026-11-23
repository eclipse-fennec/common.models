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
 * A representation of the model object '<em><b>CIM Zone Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ZoneSet is a group of zones that are managed collectively by the same domain. The managing domain is indicated by the HostedCollection association. For example, for Fibre Channel, this property would indicate a set of zones that are part of a fabric. The zones are under enforcement by the fabric, only if the Zoneset is set to active.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ZoneSet#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ZoneSet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::FC' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Write='true' override.ElementName.Description='A user-friendly name for the ZoneSet that is unique within the AdminDomain.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ZoneSet extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that this ZoneSet is currently active (that is, under enforcement of a fabric). This property can be used to distinguish between a ZoneSet that is currently active and a snapshot of a ZoneSet (with the same InstanceName) that is for "offline" editing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ZoneSet_Active()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true' Write='true'"
	 * @generated
	 */
	Boolean getActive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ZoneSet#getActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Boolean value);

} // CIM_ZoneSet
