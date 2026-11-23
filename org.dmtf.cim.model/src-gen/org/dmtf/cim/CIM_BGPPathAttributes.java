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
 * A representation of the model object '<em><b>CIM BGP Path Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the per-path information used to process specific BGP attribute information, as defined in the bgp4PathAttrTable of RFC 1657.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getASNumbers <em>AS Numbers</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrNextHop <em>Path Attr Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrASPathSegment <em>Path Attr AS Path Segment</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrOrigin <em>Path Attr Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrMultiExitDisc <em>Path Attr Multi Exit Disc</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrLocalPref <em>Path Attr Local Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAtomicAggregate <em>Path Attr Atomic Aggregate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAggregatorAS <em>Path Attr Aggregator AS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAggregatorAddr <em>Path Attr Aggregator Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrCalcLocalPref <em>Path Attr Calc Local Pref</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrBest <em>Path Attr Best</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrUnknown <em>Path Attr Unknown</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrUnknownNumber <em>Path Attr Unknown Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='ASNumbers,PathAttrNextHop'"
 * @generated
 */
@ProviderType
public interface CIM_BGPPathAttributes extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>AS Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separated list of AS numbers, as would be stored in the value portion of the path segment in the PathAttrASPathSegment property. This list can be ordered or unordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AS Numbers</em>' attribute.
	 * @see #setASNumbers(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_ASNumbers()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='512'"
	 * @generated
	 */
	String getASNumbers();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getASNumbers <em>AS Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AS Numbers</em>' attribute.
	 * @see #getASNumbers()
	 * @generated
	 */
	void setASNumbers(String value);

	/**
	 * Returns the value of the '<em><b>Path Attr Next Hop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the address of the border router that should be used for the destination network.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Next Hop</em>' attribute.
	 * @see #setPathAttrNextHop(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrNextHop()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='32' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrNextHop\"]'"
	 * @generated
	 */
	String getPathAttrNextHop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrNextHop <em>Path Attr Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Next Hop</em>' attribute.
	 * @see #getPathAttrNextHop()
	 * @generated
	 */
	void setPathAttrNextHop(String value);

	/**
	 * Returns the value of the '<em><b>Path Attr AS Path Segment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property and its description are taken directly from RFC 1657. The property represents a sequence of AS path segments. Each AS path segment is represented by the tuple: 
	 * <type, length, value> 
	 * The type is a 1-octet field which has two possible values: 
	 * 1 = AS_SET 
	 * 2 = AS_SEQUENCE 
	 * An AS_SET is an unordered set of ASs representing the path that an UPDATE message has traversed, and an AS_SEQUENCE is an ordered set of ASs representing the path that an UPDATE message has traversed. 
	 * The length is a 1-octet field containing the number of ASs in the value field. 
	 * The value field contains one or more AS numbers, each AS is represented in the octet string as a pair of octets according to the following algorithm: 
	 * first-byte-of-pair = ASNumber / 256; 
	 * second-byte-of-pair = ASNumber & 255; 
	 * This property is mapped from the bgp4PathAttrASPathSegment MIB variable, which is an OctetString. Its length is defined as a minimum of 2 and a maximum of 255 octets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr AS Path Segment</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrASPathSegment()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrASPathSegment\"]'"
	 * @generated
	 */
	EList<Integer> getPathAttrASPathSegment();

	/**
	 * Returns the value of the '<em><b>Path Attr Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an enumeration that defines the ultimate origin of the path information. The value 'IGP' means that the origin is interior; the value 'EGP' means that it was learned via an EGP; the value 'INCOMPLETE' means that the origin is undetermined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Origin</em>' attribute.
	 * @see #setPathAttrOrigin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrOrigin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"IGP\",\"EGP\",\"Incomplete\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrOrigin\"]'"
	 * @generated
	 */
	Integer getPathAttrOrigin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrOrigin <em>Path Attr Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Origin</em>' attribute.
	 * @see #getPathAttrOrigin()
	 * @generated
	 */
	void setPathAttrOrigin(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Multi Exit Disc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This metric is used to discriminate between multiple adjacent autonomous systems. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Multi Exit Disc</em>' attribute.
	 * @see #setPathAttrMultiExitDisc(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrMultiExitDisc()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrMultiExitDisc\"]'"
	 * @generated
	 */
	Integer getPathAttrMultiExitDisc();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrMultiExitDisc <em>Path Attr Multi Exit Disc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Multi Exit Disc</em>' attribute.
	 * @see #getPathAttrMultiExitDisc()
	 * @generated
	 */
	void setPathAttrMultiExitDisc(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Local Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the originating BGP4 speaker's degree of preference for an advertised route. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Local Pref</em>' attribute.
	 * @see #setPathAttrLocalPref(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrLocalPref()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrLocalPref\"]'"
	 * @generated
	 */
	Integer getPathAttrLocalPref();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrLocalPref <em>Path Attr Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Local Pref</em>' attribute.
	 * @see #getPathAttrLocalPref()
	 * @generated
	 */
	void setPathAttrLocalPref(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Atomic Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an enumeration that defines whether or not the local system has selected a less specific route without selecting a more specific route. There are two values, 1 and 2, indicating that a less specific route has not and has been selected, respectively. This is a 32-bit integer to correspond to the IETF MIB.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Atomic Aggregate</em>' attribute.
	 * @see #setPathAttrAtomicAggregate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrAtomicAggregate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Less Specific Not Selected\",\"Less Specific Selected\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrAtomicAggregate\"]'"
	 * @generated
	 */
	Long getPathAttrAtomicAggregate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAtomicAggregate <em>Path Attr Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Atomic Aggregate</em>' attribute.
	 * @see #getPathAttrAtomicAggregate()
	 * @generated
	 */
	void setPathAttrAtomicAggregate(Long value);

	/**
	 * Returns the value of the '<em><b>Path Attr Aggregator AS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the AS number of the last BGP speaker that performed route aggregation. A value of 0 indicates the absence of this attribute. The range of this attribute is defined to be 0 to 65535.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Aggregator AS</em>' attribute.
	 * @see #setPathAttrAggregatorAS(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrAggregatorAS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrAggregatorAS\"]'"
	 * @generated
	 */
	Integer getPathAttrAggregatorAS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAggregatorAS <em>Path Attr Aggregator AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Aggregator AS</em>' attribute.
	 * @see #getPathAttrAggregatorAS()
	 * @generated
	 */
	void setPathAttrAggregatorAS(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Aggregator Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the IP address of the last BGP speaker that performed route aggregation. A value of 0.0.0.0 indicates the absence of this attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Aggregator Addr</em>' attribute.
	 * @see #setPathAttrAggregatorAddr(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrAggregatorAddr()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrAggregatorAddr\"]'"
	 * @generated
	 */
	String getPathAttrAggregatorAddr();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrAggregatorAddr <em>Path Attr Aggregator Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Aggregator Addr</em>' attribute.
	 * @see #getPathAttrAggregatorAddr()
	 * @generated
	 */
	void setPathAttrAggregatorAddr(String value);

	/**
	 * Returns the value of the '<em><b>Path Attr Calc Local Pref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the degree of preference calculated by the receiving BGP speaker for an advertised route. A value of -1 indicates the absence of this attribute. The range of this attribute is defined to be -1 to 2147483647.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Calc Local Pref</em>' attribute.
	 * @see #setPathAttrCalcLocalPref(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrCalcLocalPref()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint16' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrCalcLocalPref\"]'"
	 * @generated
	 */
	Integer getPathAttrCalcLocalPref();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrCalcLocalPref <em>Path Attr Calc Local Pref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Calc Local Pref</em>' attribute.
	 * @see #getPathAttrCalcLocalPref()
	 * @generated
	 */
	void setPathAttrCalcLocalPref(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an indication of whether or not this route was chosen as the best BGP route. There are three possible values, 0 (Unknown), 1 (FALSE) and 2 (TRUE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Best</em>' attribute.
	 * @see #setPathAttrBest(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrBest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"False\",\"True\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrBest\"]'"
	 * @generated
	 */
	Integer getPathAttrBest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrBest <em>Path Attr Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Best</em>' attribute.
	 * @see #getPathAttrBest()
	 * @generated
	 */
	void setPathAttrBest(Integer value);

	/**
	 * Returns the value of the '<em><b>Path Attr Unknown</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains one or more path atributes not understood by this BGP speaker. It is a array of path attributes that are not understood. The number of attributes is placed in a separate property of this class, PathAttrUnknownNumber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Unknown</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrUnknown()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrUnknown\"]' ModelCorrespondence='[\"CIM_BGPPathAttributes.PathAttrUnknownNumber\"]'"
	 * @generated
	 */
	EList<String> getPathAttrUnknown();

	/**
	 * Returns the value of the '<em><b>Path Attr Unknown Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of unknown attributes in the array, PathAttrUnknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Attr Unknown Number</em>' attribute.
	 * @see #setPathAttrUnknownNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPPathAttributes_PathAttrUnknownNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrUnknown\"]' ModelCorrespondence='[\"CIM_BGPPathAttributes.PathAttrUnknown\"]'"
	 * @generated
	 */
	Integer getPathAttrUnknownNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPPathAttributes#getPathAttrUnknownNumber <em>Path Attr Unknown Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Attr Unknown Number</em>' attribute.
	 * @see #getPathAttrUnknownNumber()
	 * @generated
	 */
	void setPathAttrUnknownNumber(Integer value);

} // CIM_BGPPathAttributes
