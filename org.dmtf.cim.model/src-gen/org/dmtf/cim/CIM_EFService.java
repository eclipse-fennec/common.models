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
 * A representation of the model object '<em><b>CIM EF Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a specialization of the general concept of forwarding network traffic by adding specific semantics that characterize the operation of the Expedited Forwarding (EF) Service (defined in RFC 2598). 
 * 
 * The EF PHB can be used to build a low loss, low latency, low jitter, assured bandwidth, end-to-end service through DiffServ domains. Such a service appears to the endpoints like a point-to-point connection or a virtual leased line. This service has also been described as Premium service in the IETF literature. 
 * 
 * RFC 2598 defines one DSCP for the EF service. Thus, there is no need to define any attributes in this class, since an instance of the EFService class, by definition, means that this particular DSCP is used. 
 * 
 * EFService is deprecated since forwarding based on the value of the DiffServ Code Point is specified using a FilterList, which is associated with a ClassifierElement. If there is a need to distinguish a higher-level set of coordinated QoS services, the DiffServService class can be instantiated directly.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EFService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiffServService\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_EFService extends CIM_DiffServService {
} // CIM_EFService
