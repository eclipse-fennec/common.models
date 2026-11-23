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
 * A representation of the model object '<em><b>CIM Filter Collection Subscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_FilterCollectionSubscription associates the CIM_FilterCollection with a CIM_ListenerDestionation.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterCollectionSubscription()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.27.0' UMLPackagePath='CIM::Event' override.Filter='CIM_FilterCollection REF' override.Filter.Description='The Filter that defines the criteria and data of the possible Indications of this subscription.' override.Handler='CIM_ListenerDestination REF' override.Handler.Description='The Handler addressing delivery of the possible Indications of this subscription.' keys='Filter,Handler'"
 * @generated
 */
@ProviderType
public interface CIM_FilterCollectionSubscription extends CIM_AbstractIndicationSubscription {
} // CIM_FilterCollectionSubscription
