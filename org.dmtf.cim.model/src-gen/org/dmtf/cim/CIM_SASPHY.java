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
 * A representation of the model object '<em><b>CIM SASPHY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SASPHY class describes the characteristics for the physical connection between SAS devices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SASPHY#getHardwareMinimumPhysicalLinkRate <em>Hardware Minimum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SASPHY#getHardwareMaximumPhysicalLinkRate <em>Hardware Maximum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SASPHY#getProgrammedMinimumPhysicalLinkRate <em>Programmed Minimum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SASPHY#getProgrammedMaximumPhysicalLinkRate <em>Programmed Maximum Physical Link Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SASPHY#getNegotiatedPhysicalLinkRate <em>Negotiated Physical Link Rate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Ports' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_SASPHY extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Hardware Minimum Physical Link Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum physical link rate capability of a phy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Minimum Physical Link Rate</em>' attribute.
	 * @see #setHardwareMinimumPhysicalLinkRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY_HardwareMinimumPhysicalLinkRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"SAS-2.ISO/IEC 14776-152 | HARDWARE MINIMUM PHYSICAL LINK RATE\"]'"
	 * @generated
	 */
	Long getHardwareMinimumPhysicalLinkRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SASPHY#getHardwareMinimumPhysicalLinkRate <em>Hardware Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Minimum Physical Link Rate</em>' attribute.
	 * @see #getHardwareMinimumPhysicalLinkRate()
	 * @generated
	 */
	void setHardwareMinimumPhysicalLinkRate(Long value);

	/**
	 * Returns the value of the '<em><b>Hardware Maximum Physical Link Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum physical link rate capability of a phy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hardware Maximum Physical Link Rate</em>' attribute.
	 * @see #setHardwareMaximumPhysicalLinkRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY_HardwareMaximumPhysicalLinkRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"SAS-2.ISO/IEC 14776-152 | HARDWARE MAXIMUM PHYSICAL LINK RATE\"]'"
	 * @generated
	 */
	Long getHardwareMaximumPhysicalLinkRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SASPHY#getHardwareMaximumPhysicalLinkRate <em>Hardware Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Maximum Physical Link Rate</em>' attribute.
	 * @see #getHardwareMaximumPhysicalLinkRate()
	 * @generated
	 */
	void setHardwareMaximumPhysicalLinkRate(Long value);

	/**
	 * Returns the value of the '<em><b>Programmed Minimum Physical Link Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the minimum physical link rate the phy shall support during a link reset sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Programmed Minimum Physical Link Rate</em>' attribute.
	 * @see #setProgrammedMinimumPhysicalLinkRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY_ProgrammedMinimumPhysicalLinkRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"SAS-2.ISO/IEC 14776-152 | PROGRAMMED MINIMUM PHYSICAL LINK RATE\"]'"
	 * @generated
	 */
	Long getProgrammedMinimumPhysicalLinkRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SASPHY#getProgrammedMinimumPhysicalLinkRate <em>Programmed Minimum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programmed Minimum Physical Link Rate</em>' attribute.
	 * @see #getProgrammedMinimumPhysicalLinkRate()
	 * @generated
	 */
	void setProgrammedMinimumPhysicalLinkRate(Long value);

	/**
	 * Returns the value of the '<em><b>Programmed Maximum Physical Link Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the maximum physical link rates the phy shall support during a link reset sequence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Programmed Maximum Physical Link Rate</em>' attribute.
	 * @see #setProgrammedMaximumPhysicalLinkRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY_ProgrammedMaximumPhysicalLinkRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"SAS-2.ISO/IEC 14776-152 | PROGRAMMED MAXMUM PHYSICAL LINK RATE\"]'"
	 * @generated
	 */
	Long getProgrammedMaximumPhysicalLinkRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SASPHY#getProgrammedMaximumPhysicalLinkRate <em>Programmed Maximum Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programmed Maximum Physical Link Rate</em>' attribute.
	 * @see #getProgrammedMaximumPhysicalLinkRate()
	 * @generated
	 */
	void setProgrammedMaximumPhysicalLinkRate(Long value);

	/**
	 * Returns the value of the '<em><b>Negotiated Physical Link Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * desctiption TBD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Physical Link Rate</em>' attribute.
	 * @see #setNegotiatedPhysicalLinkRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_SASPHY_NegotiatedPhysicalLinkRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"SAS-2.ISO/IEC 14776-152 | NEGOTIATED PHYSICAL LINK RATE\"]'"
	 * @generated
	 */
	Long getNegotiatedPhysicalLinkRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SASPHY#getNegotiatedPhysicalLinkRate <em>Negotiated Physical Link Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Physical Link Rate</em>' attribute.
	 * @see #getNegotiatedPhysicalLinkRate()
	 * @generated
	 */
	void setNegotiatedPhysicalLinkRate(Long value);

} // CIM_SASPHY
