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
 * A representation of the model object '<em><b>CIM Next Hop Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NextHopRoute represents one of a series of 'hops' to reach a network destination. A route is administratively defined, or calculated/learned by a particular routing process. A ConcreteDependency associaton may be instantiated between a route and its routing service to indicate this. (In this scenario, the route is dependent on the service.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRoute#getDestinationAddress <em>Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRoute#getAdminDistance <em>Admin Distance</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRoute#getRouteMetric <em>Route Metric</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRoute#getIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextHopRoute#getTypeOfRoute <em>Type Of Route</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.40.0' UMLPackagePath='CIM::Network::Routes' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NextHopRoute extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The address which serves as the destination to be reached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Address</em>' attribute.
	 * @see #setDestinationAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute_DestinationAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDestinationAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRoute#getDestinationAddress <em>Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Address</em>' attribute.
	 * @see #getDestinationAddress()
	 * @generated
	 */
	void setDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>Admin Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific administrative distance of this route, overriding any default distances specified by the system or routing service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Distance</em>' attribute.
	 * @see #setAdminDistance(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute_AdminDistance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getAdminDistance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRoute#getAdminDistance <em>Admin Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Distance</em>' attribute.
	 * @see #getAdminDistance()
	 * @generated
	 */
	void setAdminDistance(Integer value);

	/**
	 * Returns the value of the '<em><b>Route Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RouteMetric provides a numeric indication as to the preference of this route, compared to other routes that reach the same destination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Route Metric</em>' attribute.
	 * @see #setRouteMetric(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute_RouteMetric()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRouteMetric();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRoute#getRouteMetric <em>Route Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Metric</em>' attribute.
	 * @see #getRouteMetric()
	 * @generated
	 */
	void setRouteMetric(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE indicates that this is a static route, and FALSE indicates a dynamically-learned route.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Static</em>' attribute.
	 * @see #setIsStatic(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute_IsStatic()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsStatic();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRoute#getIsStatic <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Static</em>' attribute.
	 * @see #getIsStatic()
	 * @generated
	 */
	void setIsStatic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type Of Route</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated integer indicating whether the route is administrator-defined (value=2), computed (via a routing protocol/algorithm, value=3) or the actual route implemented in the network (value=4). The default is a computed route.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Route</em>' attribute.
	 * @see #setTypeOfRoute(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextHopRoute_TypeOfRoute()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Administrator Defined Route\",\"Computed Route\",\"Actual Route\"]'"
	 * @generated
	 */
	Integer getTypeOfRoute();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextHopRoute#getTypeOfRoute <em>Type Of Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Route</em>' attribute.
	 * @see #getTypeOfRoute()
	 * @generated
	 */
	void setTypeOfRoute(Integer value);

} // CIM_NextHopRoute
