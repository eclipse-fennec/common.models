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
 * A representation of the model object '<em><b>CIM FC Port Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A port that supports FibreChannel capabilities may be configured via the FCPortSettings class. The configuration changes are expected to be stored to non-volatile memory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCPortSettings#getRequestedType <em>Requested Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCPortSettings()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::FC' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCPortSettings extends CIM_NetworkPortSettings {
	/**
	 * Returns the value of the '<em><b>Requested Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedType acts as a filter on the enabled port types that a port may negotiate after a connection is established. 
	 * Changing this value may cause a port reset if the enabled port type doesn't fall within the boundaries of the new requested port type filter. It may also cause the port to stay disabled if the new port type filter is incompatible with the attached device. 
	 * Acceptable values for this property may be found in the FCPortCapabilities.RequestedTypesSupported array. 
	 * "G" = Port may only act as an expansion port (E), or a fabric port (F). "GL" = Port may only act an an expansion port (E), a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). "E" = Port may only act as an expansion port (E) connecting fabric elements. "F" = Port may only act as a fabric port (F). "FX" = Port may only act as a fabric port (F), or a fabric port supporting FC arbitrated loop (FL). "B" = Port may only act as a bridge port (B). "NX" = Port may only act as a node port (N) or a node port supporting FC arbitrated loop (NL). "N" = Port may only act as a Node port. "NL" = Port may only act as a Node Port supporting FC arbitrated loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Type</em>' attribute.
	 * @see #setRequestedType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCPortSettings_RequestedType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"16000..65535\"]' Values='[\"G\",\"GL\",\"E\",\"F\",\"FX\",\"B\",\"NX\",\"N\",\"NL\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"FC-SWAPI.INCITS-T11|UcPortConfigSetType\"]' ModelCorrespondence='[\"CIM_FCPortCapabilities.RequestedTypesSupported\",\"CIM_FCPort.PortType\"]'"
	 * @generated
	 */
	Integer getRequestedType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCPortSettings#getRequestedType <em>Requested Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Type</em>' attribute.
	 * @see #getRequestedType()
	 * @generated
	 */
	void setRequestedType(Integer value);

} // CIM_FCPortSettings
