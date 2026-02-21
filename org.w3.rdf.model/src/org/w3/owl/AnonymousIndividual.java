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
package org.w3.owl;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class of anonymous owl individuals.  Such individuals can only be referenced locally, and thus there is no corresponding URI for this class in the W3C OWL 2 namespace.
 * <!-- end-model-doc -->
 *
 *
 * @see org.w3.owl.OwlPackage#getAnonymousIndividual()
 * @model
 * @generated
 */
@ProviderType
public interface AnonymousIndividual extends Individual {
} // AnonymousIndividual
