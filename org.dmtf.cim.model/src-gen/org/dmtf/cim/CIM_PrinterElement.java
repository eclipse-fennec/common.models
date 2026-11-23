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
 * A representation of the model object '<em><b>CIM Printer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class extends LogicalElement to abstract the concept of a PrinterElement that is a component (e.g., PrintMarker) of a scoping Printer (print device). This class defines common properties for key (InstanceID) and for correlation of status and event (alert) information between CIM and SNMP management interfaces (SNMPRowId). 
 * Note: A Printer shall be associated with at least one of every required component (e.g., PrintMarker) via an instance of the PrinterComponent class. A Printer may be associated with zero or more optional components (e.g., PrintSupply) via an instance of the ConcreteComponent class. See: Model in section 2 of Printer MIB (RFC 3805) and section 3 of Finisher MIB (RFC 3806).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrinterElement#getSNMPRowId <em>SNMP Row Id</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrinterElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.31.1' UMLPackagePath='CIM::Device::Printing' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; shall not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID shall appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity shall assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; shall not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID shall appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity shall assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm shall be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrinterElement extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>SNMP Row Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique value used by a scoping Printer to identify this component (e.g., PrintMarker) of the scoping Printer. Although these values may change due to a reconfiguration of the Printer (e.g., the addition of new components to the Printer), values should remain stable across successive Printer power cycles. Note: This property is necessary to correlate status and event (alert) information between CIM and SNMP interfaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SNMP Row Id</em>' attribute.
	 * @see #setSNMPRowId(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrinterElement_SNMPRowId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='1' MaxValue='65535' MappingStrings='[\"MIB.IETF|Printer-MIB.prtCoverIndex\",\"MIB.IETF|Printer-MIB.prtInputIndex\",\"MIB.IETF|Printer-MIB.prtOutputIndex\",\"MIB.IETF|Printer-MIB.prtMarkerIndex\",\"MIB.IETF|Printer-MIB.prtMarkerSuppliesIndex\",\"MIB.IETF|Printer-MIB.prtMediaPathIndex\",\"MIB.IETF|Printer-MIB.prtChannelIndex\",\"MIB.IETF|Printer-MIB.prtInterpreterIndex\",\"MIB.IETF|Printer-MIB.prtConsoleLightIndex\",\"MIB.IETF|Finisher-MIB.finDeviceIndex\",\"MIB.IETF|Finisher-MIB.finSupplyIndex\"]'"
	 * @generated
	 */
	Long getSNMPRowId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrinterElement#getSNMPRowId <em>SNMP Row Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SNMP Row Id</em>' attribute.
	 * @see #getSNMPRowId()
	 * @generated
	 */
	void setSNMPRowId(Long value);

} // CIM_PrinterElement
